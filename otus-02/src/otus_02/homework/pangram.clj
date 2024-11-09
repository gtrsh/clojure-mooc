(ns otus-02.homework.pangram
  (:require [clojure.string :as string]))

(def alphabet-set (set "abcdefghijklmnopqrstuvwxyz"))

(defn normalize-str [input-str]
  (-> input-str
      string/trim
      string/lower-case
      (string/replace #"[^a-z]" "")))

(defn is-pangram [test-string]
  (=
   alphabet-set
   (set (normalize-str test-string))))
