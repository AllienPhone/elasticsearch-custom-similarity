package org.elasticsearch.infoso.plugin.similarity;

import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.inject.assistedinject.Assisted;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.index.Index;
import org.elasticsearch.index.settings.IndexSettings;
import org.elasticsearch.index.similarity.SimilarityProvider;
import org.elasticsearch.index.similarity.SimilarityProviderFactory;

public class InfosoSimilarityFactory implements SimilarityProviderFactory {

	private Index index;
	private Settings settings;
	private String name;
	private Settings indexSetting;

	@Inject
	public InfosoSimilarityFactory(Index index,
			@IndexSettings Settings indexSettings, @Assisted String name,
			@Assisted Settings settings) {
		this.index = index;
		this.indexSetting = indexSetting;
		this.name = name;
		this.settings = settings;
	}

	@Override
	public SimilarityProvider create(String name, Settings settings) {
		// TODO Auto-generated method stub
		return new InfosoSimilarityProvider(this.index, this.indexSetting,
				this.name, this.settings);
	}
}
