addCommandAlias("prepare", ";+clean;+test;+publishLocal;+publishSigned")
addCommandAlias("e2eRelease", ";prepare;sonatypeBundleRelease")