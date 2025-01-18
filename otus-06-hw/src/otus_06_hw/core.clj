(ns otus-06-hw.core)

(defn greet []
  (println "Enter your name: ")
  (flush)
  (let [my-name (read-line)]
    (println (str "Hello " my-name))))
