package org.elasticsearch.infoso.plugin.similarity;

import org.apache.lucene.index.FieldInvertState;
import org.apache.lucene.search.DefaultSimilarity;

public class InfosoSimilarity extends DefaultSimilarity {
	@Override
	public float decodeNormValue(byte b) {
		return 1.0f;
	}

	@Override
	public float queryNorm(float sumOfSquaredWeights) {
		return 1.0f;
	}

	@Override
	public float computeNorm(String field, FieldInvertState state) {
		return 1.0f;
	}

	
	@Override
	public float tf(float freq) {
		return 1.0f;
	}

	@Override
	public float sloppyFreq(int distance) {
		return 1.0f;
	}

	@Override
	public float idf(int docFreq, int numDocs) {
		return 1.0f;
	}

	@Override
	public float coord(int overlap, int maxOverlap) {
		return 1.0f;
	}
}
