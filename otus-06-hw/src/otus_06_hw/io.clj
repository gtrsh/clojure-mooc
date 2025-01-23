(ns otus-06-hw.io
  (:require [clojure.java.io :as io]
            [clojure.string :as str]))

(def DATA_DELIMITER #"\|")
(def DATA_DIR_PREFIX "homework/")
(def DATA_NAMES ["cust" "prod" "sales"])
(def DATA_EXTENSION ".txt")

(defn load-db-file
  [file-name]

  (-> file-name
      (as-> file-name (str DATA_DIR_PREFIX file-name DATA_EXTENSION))
      io/resource
      slurp
      str/split-lines
      (as-> xs
            (map #(str/split %1 DATA_DELIMITER) xs))))

(defn create-cust-map
  [cust-vec]

  {:id-cust (Integer/parseInt (get cust-vec 0 "0"))
   :name (get cust-vec 1 "")
   :address (get cust-vec 2 "")
   :phone-number (get cust-vec 3 "")})

(defn create-prod-map
  [prod-vec]

  {:id-prod (Integer/parseInt (get prod-vec 0 "0"))
   :item-description (get prod-vec 1 "")
   :unit-cost (Double/parseDouble (get prod-vec 2 "0.0"))})

(defn create-sales-map
  [sales-vec]

  {:id-sales (Integer/parseInt (get sales-vec 0 "0"))
   :id-cust (Integer/parseInt (get sales-vec 1 "0"))
   :id-prod (Integer/parseInt (get sales-vec 2 "0"))
   :items-count (Integer/parseInt (get sales-vec 3 "0"))})

(defn init-db
  []

  (let [[cust prod sales] DATA_NAMES]

    {:cust-table (map create-cust-map (load-db-file cust))
     :prod-table (map create-prod-map (load-db-file prod))
     :sales-table (map create-sales-map (load-db-file sales))}))
