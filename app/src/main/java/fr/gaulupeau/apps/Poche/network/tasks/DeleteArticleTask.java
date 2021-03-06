package fr.gaulupeau.apps.Poche.network.tasks;

import android.content.Context;
import android.widget.Toast;

import java.io.IOException;

import fr.gaulupeau.apps.InThePoche.R;
import fr.gaulupeau.apps.Poche.entity.Article;
import fr.gaulupeau.apps.Poche.entity.ArticleDao;
import fr.gaulupeau.apps.Poche.ui.DialogHelperActivity;
import fr.gaulupeau.apps.Poche.ui.IconUnreadWidget;

public class DeleteArticleTask extends GenericArticleTask {

    public DeleteArticleTask(Context context, int articleId, ArticleDao articleDao, Article article) {
        super(context, articleId, articleDao, article);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();

        articleDao.delete(article);
    }

    @Override
    protected Boolean doInBackgroundSimple(Void... params) throws IOException {
        if(isOffline || noCredentials) return false;

        if(service.deleteArticle(articleId)) return true;

        if(context != null) errorMessage = context.getString(R.string.deleteArticle_errorMessage);
        return false;
    }

    @Override
    protected void onPostExecute(Boolean success) {
        super.onPostExecute(success);

        if(success || isOffline || noCredentials) {
            if(context != null) {
                Toast.makeText(context, R.string.deleteArticle_deleted, Toast.LENGTH_SHORT).show();

                if(isOffline && !noCredentials) {
                    Toast.makeText(context, R.string.deleteArticle_noInternetConnection,
                            Toast.LENGTH_SHORT).show();
                }
                IconUnreadWidget.triggerWidgetUpdate(context);
            }
        } else {
            if(context != null) {
                DialogHelperActivity.showConnectionFailureDialog(context, errorMessage);
            }
        }
    }

}
