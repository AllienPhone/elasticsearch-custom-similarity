package org.elasticsearch.infoso.plugin.similarity;

import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.inject.assistedinject.Assisted;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.env.Environment;
import org.elasticsearch.index.Index;
import org.elasticsearch.index.settings.IndexSettings;
import org.elasticsearch.index.similarity.AbstractSimilarityProvider;

public class InfosoSimilarityProvider extends
		AbstractSimilarityProvider<InfosoSimilarity> {

	private final InfosoSimilarity infosoSimilarity;

	@Inject
	protected InfosoSimilarityProvider(Index index,
			@IndexSettings Settings indexSettings, @Assisted String name,
			@Assisted Settings settings) {
		super(index, indexSettings, name);
		// TODO Auto-generated constructor stub
		this.infosoSimilarity = new InfosoSimilarity();
	}

	@Override
	public InfosoSimilarity get() {
		// TODO Auto-generated method stub
		return this.infosoSimilarity;
	}
}
