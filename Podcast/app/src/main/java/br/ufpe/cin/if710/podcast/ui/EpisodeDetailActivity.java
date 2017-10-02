package br.ufpe.cin.if710.podcast.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import br.ufpe.cin.if710.podcast.R;
import br.ufpe.cin.if710.podcast.domain.ItemFeed;

public class EpisodeDetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episode_detail);

        ItemFeed item = (ItemFeed)getIntent().getSerializableExtra("item");

        final TextView title = (TextView) findViewById(R.id.details_title);
        title.setText(item.getTitle());

        final TextView pubDate = (TextView) findViewById(R.id.details_pubdate);
        pubDate.setText(item.getPubDate());

        final TextView description = (TextView) findViewById(R.id.details_description);
        description.setText(item.getDescription());

        final TextView link = (TextView) findViewById(R.id.details_link);
        link.setText(item.getLink());
    }
}
