elasticsearch-custom-similarity plugins����д��elasticsearch��defaultSimilarity�㷨<br/>
һ������custom-simliarity���<br/>
�������������elasticsearch�Ĳ��Ŀ¼<br/>
��������ǽ�����������������setting��ָ��<br/>
"index.similarity.search.type":"org.elasticsearch.infoso.plugin.similarity.InfosoSimilarityProvider"<br/>
"index.similarity.index.type":"org.elasticsearch.infoso.plugin.similarity.InfosoSimilarityProvider"<br/>
�ġ�����޸��������������ȹر���������������setting<br/>
curl -XPOST 'http://host:port/tweeter/' -d '
{
  "settings": {
    "similarity": {
      "index": {
        "type": "org.elasticsearch.infoso.plugin.similarity.InfosoSimilarityProvider"
      },
      "search": {
        "type": "org.elasticsearch.infoso.plugin.similarity.InfosoSimilarityProvider"
      }
    }
  }
}'
����
