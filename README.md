elasticsearch-custom-similarity plugins是重写了elasticsearch的defaultSimilarity算法<br/>
一、下载custom-simliarity插件<br/>
二、将插件放入elasticsearch的插件目录<br/>
三、如果是建创索引则在索引的setting中指定<br/>
"index.similarity.search.type":"org.elasticsearch.infoso.plugin.similarity.InfosoSimilarityProvider"<br/>
"index.similarity.index.type":"org.elasticsearch.infoso.plugin.similarity.InfosoSimilarityProvider"<br/>
四、如果修改已有索引，则先关闭索引更新索引的setting<br/>
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
即可
