(defn co2-estimate [year]
  "returns co2 ppm for the `year`"
;  (let [base-co2] 382)
;  (let [base-year] 2006)
  (+ base-co2 (* (- year base-year) 2))
)

(defn co2-estimate [year]
  "returns co2 ppm for the `year`"
  (def base-co2 382)
  (def base-year 2006)
  (+ base-co2 (* (- year base-year) 2))
)


; javascript to clojure
;let x = 50;
;if (x >= 1 && x <= 100 || x % 100 == 0) {
;  console.log("Valid");
;} else {
;  console.log("Invalid");
;}

;doesn't work
(def x 50)
(if ((and (>= x 1) (<= x 100)
  (or (= 0 (mod x 100))))
  (println "Valid")
  (println "Invalid")))

;solution
(let [x 50]
  (if (or (<= 1 x 100) (= 0 (mod x 100)))
    (println "Valid")
    (println "Invalid")))

;i type
(let [x 50]
  (if (or (<= 1 x 100) (= 0 (mod x 100)))
    (println "Valid")
    (println "Invalid")))


;;this works
(def x 201)
(if (or
      (and (>= x 1) (<= x 100))
      (= 0 (mod x 100)))
  (println "Valid")
  (println "Invalid"))


; one line similar to ternary operator
(let [x 50]
  (println (if (or (<= 1 x 100) (= 0 (mod x 100))) "Valid" "Invalid")))

;works but doesn't do the return stuff
(defn meditate [s calmness-level]
  "If `calmness-level < 5 angry. Between 5 and 9 calm. 10 nirvana"
  (if (< calmness-level 5)
    (println "ur angry")
    (if (<= calmness-level 5 9)
      (println "ur okay")
      (if (= calmness-level 10)
        (println "nirvana!")))))


;doing exactly it w/ return and string modification
(defn meditate [s calmness-level]
  "If `calmness-level < 5 angry. Between 5 and 9 calm. 10 nirvana"
  (if (< calmness-level 5)
    (str (clojure.string/upper-case s) " , I TELL YA") ;uppercase and add " , I TEL YA! "
    (if (<= 5 calmness-level 9)
      (clojure.string/capitalize s) ;return s with first letter capitlized
      (if (= calmness-level 10)
        (clojure.string/reverse s))))) ;reverse s



;;TODO rewrite using cond
;doing exactly it w/ return and string modification
(defn meditate [s calmness-level]
  "If `calmness-level < 5 angry. Between 5 and 9 calm. 10 nirvana"
  (cond 
    (< calmness-level 5) (str (clojure.string/upper-case s) " , I TELL YA") ;uppercase and add " , I TEL YA! "
    (<= 5 calmness-level 9) (clojure.string/capitalize s) ;return s with first letter capitlized
    (= calmness-level 10) (clojure.string/reverse s))) ;reverse s
