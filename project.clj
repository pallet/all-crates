(defproject com.palletops/all-crates "0.8.0-alpha.1"
  :description "An all in one dependency for pallet crates."
  :url "https://github.com/all-crates"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[com.palletops/app-deploy-crate "0.8.0-alpha.1"]
                 [com.palletops/java-crate "0.8.0-beta.4"]
                 [com.palletops/lein-crate "0.8.0-alpha.1"]
                 [com.palletops/git-crate "0.8.0-alpha.1"]
                 [com.palletops/riemann-crate "0.8.0-alpha.2"]
                 [com.palletops/upstart-crate "0.8.0-alpha.1"]
                 [com.palletops/runit-crate "0.8.0-alpha.1"]
                 [com.palletops/ami-crate "0.8.0-alpha.1"]
                 [com.palletops/rbenv-crate "0.8.0-alpha.1"]]
  :prep-tasks ["crates-pages"]
  :classifiers {:meta {:dependencies ^:replace []
                       :source-paths ^:replace []
                       :resource-paths ^:replace ["target/metadata"]}})
