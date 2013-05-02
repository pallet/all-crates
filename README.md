# all-crates

A pallet library that depends on all crates.  The main purpose of this lib is to
help in the generation of documentation, but it is possible to use the library
as an "all in one" dependency to bring in pallet crates.

## Usage

Add this project to you dependencies to bring in a dependency on all pallet
crates.

```clj
[com.palletops/all-crates "0.8.0-alpha.1"]
```

To generate documentation, run the `lein-pallet-crate` plugin with:

    lein crates-pages

The pages will be generated in `target/site`.

## License

Copyright © 2013 Hugo Duncan

Distributed under the Eclipse Public License.
