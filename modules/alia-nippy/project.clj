(defproject cc.qbits/alia-nippy "4.0.0-SNAPSHOT"
  :description "Alia extension for joda-time codec"
  :url "https://github.com/mpenet/alia/alia-joda-time"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [cc.qbits/alia "3.1.3"]
                 [com.taoensso/nippy "2.10.0"]]
  :global-vars {*warn-on-reflection* true})
