<@main title="Submit A Project">
    <h1>Submit A Project</h1>

    <form action="/projects" method="POST" class="form-horizontal">
        <#include "_form.ftl">
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <input type="submit" value="Submit Project" class="btn btn-primary" />
            </div>
        </div>
    </form>
</@main>
