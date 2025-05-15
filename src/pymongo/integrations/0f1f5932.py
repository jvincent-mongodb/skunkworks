<VirtualHost *>
    WSGIDaemonProcess my_process
    WSGIScriptAlias /my_app /path/to/app.wsgi
    WSGIProcessGroup my_process
    WSGIApplicationGroup %{GLOBAL}
</VirtualHost>