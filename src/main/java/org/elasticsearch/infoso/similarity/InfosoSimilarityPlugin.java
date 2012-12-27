/**
 * 
 */
package org.elasticsearch.infoso.similarity;

import org.elasticsearch.index.similarity.SimilarityModule;
import org.elasticsearch.plugins.AbstractPlugin;

/**
 * @author hadoop
 *
 */
public class InfosoSimilarityPlugin extends AbstractPlugin {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "infoso-similarity";
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "score arithmetic";
	}
	
	public void onModule(SimilarityModule module)
	{
		
	}

}
