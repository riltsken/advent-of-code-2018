(ns day1.1
  (:gen-class))

(def parse-input
  (line-seq (java.io.BufferedReader. *in*)) )

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (reduce + (map read-string parse-input))))
