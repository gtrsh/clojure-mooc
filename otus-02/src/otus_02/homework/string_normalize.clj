(ns otus-02.homework.string-normalize
  (:require [clojure.string :as string]))

(defn normalize-str [input-str]
  (-> input-str
      string/trim
      string/lower-case
      (string/replace #"[^a-z]" "")))
