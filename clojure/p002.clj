(use '[euler :only [run fib-seq]])

(defn fib [a b] (cons a (lazy-seq (fib b (+ a b)))))
(defn p002 ([n] (reduce + (filter #(even? %) (take-while (partial > n) (fib 0 1))))))

(run (p002 4000000))
