<@main title="${project.name}">
    <h1>${project.name}</h1>

    <p>${project.description}</p>

    <#if project.websiteUrl?has_content >
        <a type="button" class="btn btn-info" href="${project.websiteUrl}">Website</a>
    </#if>
    <#if project.sourcecodeUrl?has_content >
        <a type="button" class="btn btn-info" href="${project.sourcecodeUrl}">Source Code</a>
    </#if>
    <#if project.issuesUrl?has_content >
        <a type="button" class="btn btn-info" href="${project.issuesUrl}">Bug Tracker</a>
    </#if>

    <#if project.isMavenDependency()>
    <h3>Maven Coordinates</h3>
    <p>To use this library in a Maven project, add the following to the <code>&lt;dependencies&gt;</code> section of your project's <code>pom.xml</code>:</p>
        <pre>
&lt;dependency&gt;
    &lt;groupId&gt;${project.groupId}&lt;/groupId&gt;
    &lt;artifactId&gt;${project.artifactId}&lt;/artifactId&gt;
&lt;/dependency&gt;</pre>
    </#if>
</@main>

