(defproject otus-06-hw "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.12.0"]]
  :main ^:skip-aot otus-06-hw.cli
  :target-path "target/%s"

  :repl-options {:init-ns otus-06-hw.core}
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
