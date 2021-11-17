import sbtassembly.MergeStrategy
import com.typesafe.sbt.packager.docker.DockerChmodType

{% set class_list = cookicutter.dir_path.split('/') %}
{% if class_list|length > 1%}
targetDirectory in EditSource := (baseDirectory.value / "reader" / "src" / "main" / "resources" / {% for i in class_list %} "{{ i }}" / {% endfor %})
{% else %}
targetDirectory in EditSource := (baseDirectory.value / "reader" / "src" / "main" / "resources" / {{ class_list.0 }})
{% endif %}