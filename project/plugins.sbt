logLevel := Level.Warn

val internalNexus = "internal.nexus" at "http://nexus.oncue.verizon.net/nexus/content/groups/internal"

resolvers ++= Seq(internalNexus)

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.5.+")

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")

