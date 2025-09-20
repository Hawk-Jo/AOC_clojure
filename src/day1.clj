(ns day1)

; part 1 - 모든 인자 더하기
(require '[clojure.java.io :as io])

;; txt 파일을 숫자 리스트로 불러오기
(def nums
  (with-open [r (io/reader (io/resource "resources/day1_input.txt"))]
   (doall (map #(Integer/parseInt %)
               (line-seq r)))))
(reduce + nums)

; part 2 - 첫 twice(중복되는 인자) 찾기
(require '[clojure.java.io :as io])

;; txt 파일을 숫자 리스트로 불러오기
(def nums
  (with-open [r (io/reader (io/resource "resources/day1_input.txt"))]
    (doall (map #(Integer/parseInt %)
                (line-seq r)))))
;; 첫 twice 찾기
(defn find_first_twice [numbers]
  (loop [records #{0} current 0 process (cycle numbers)]
       (let [next (+ current (first process))]
       (if (records next)
         next
         (recur (conj records next) next (rest process))))))
(find_first_twice nums)