(ns flux.http
  (import [org.apache.solr.client.solrj.impl HttpSolrServer LBHttpSolrServer]))

(defn create [base-url core-name]
  (HttpSolrServer. (str base-url "/" (name core-name))))

(defn create-lb-conn [base-urls]
  (LBHttpSolrServer. base-urls))

