(ns otus-02.homework.palindrome
  (:require
   [clojure.string :refer [reverse]]
   [otus-02.homework.string-normalize :refer [normalize-str]]))

(defn is-palindrome [test-string]
  (let [input-string (normalize-str test-string)]
    (= input-string (reverse input-string))))
