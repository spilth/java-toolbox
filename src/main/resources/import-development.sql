INSERT INTO groups (id, name) VALUES(1, 'HTML and Markup');
INSERT INTO categories (id, group_id, name) VALUES (1, 1,'Markup Processors');
INSERT INTO project (enabled, id, description, name, issues_url, sourcecode_url, website_url, category_id, artifact_id, group_id) VALUES ('Y', 1,'A pure-Java Markdown processor based on a parboiled PEG parser supporting a number of extensions','pegdown','https://github.com/sirthias/pegdown/issues','https://github.com/sirthias/pegdown','http://pegdown.org',1,NULL,NULL);
