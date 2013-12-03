(ns euler)

(defmacro run
  [& body]
  `(let [start-time# (System/nanoTime)
         result#     ~@body
         end-time#   (System/nanoTime)
         diff-time#  (/ (- end-time# start-time#) 1e6)]
     (println result#)
     (println diff-time# "msec")))

(defn prime-factors 
  ([n]
    (prime-factors [] n 2))
  ([factors n candidate]
    (cond
      (= n 1) factors
      (= 0 (mod n candidate)) (recur (conj factors candidate) (quot n candidate) candidate)
      (> candidate (Math/sqrt n)) (conj factors n)
      :else (recur factors n (inc candidate))
    )
  )
)

(def fib-seq
  (lazy-cat [0 1] (map + (rest fib-seq) fib-seq))
)

(defn exp [x n]
  (reduce * (repeat n x))
)
