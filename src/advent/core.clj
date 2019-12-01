(ns advent.core
  (:gen-class))

(require '[clojure.string :as str])

;; TODO find a better way to slurp files with relative path
(def input 
  (slurp "/home/kris/Projects/clojure/advent/resources/1a.input"))

(def split_input (str/split input #"\n"))

(def converted_input (map #(Integer/parseInt %) split_input))

(defn calculate_fuel
  [mass]
  (- (int (/ mass 3)) 2))

(def fuel (map calculate_fuel converted_input))

(def fuel_sum (reduce + fuel))

;; 1a answer
fuel_sum

