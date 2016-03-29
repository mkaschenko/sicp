(defn p [] (p))

(defn test [x y]
  (if (zero? x)
    0
    y))

(test 0 (p))

;; If the order is applicative then Ben should see stack overflow error.
;; Because
;; - operands are evaluated first,
;; - function p is infinite recursion,
;; - recursion is implemented on top of stack.
;;
;; If the order is normal then Ben should see 0.
;; Because
;; - operands are not evaluated until their values required,
;; - function p is never evaluated.
