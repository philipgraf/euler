(use '[euler :only [run prime-factors]])

(defn p003 ([n] (apply max (prime-factors n))))

(run (p003 600851475143))
