(ns otus-02.homework.pangram
  (:require
   [otus-02.homework.string-normalize :refer [normalize-str]]))

(def alphabet-set (set "abcdefghijklmnopqrstuvwxyz"))

(defn is-pangram [test-string]
  (=
   alphabet-set
   (set (normalize-str test-string))))
