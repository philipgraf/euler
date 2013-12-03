(use '[euler :only [run exp]])

(defn palindrome? [x] (= (seq (str x)) (reverse (str x))))
(defn products [n] 
  (for 
    [
      i (range (exp 10 (- n 1)) (exp 10 n)) 
      j (range (exp 10 (- n 1)) (exp 10 n))
    ] 
    (* i j)
  )
)

(defn p004 [n] (apply max (filter palindrome? (products n))))

(run (p004 3))
