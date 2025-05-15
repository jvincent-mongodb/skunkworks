<VirtualHost *>
    WSGIDaemonProcess my_process
    WSGIScriptAlias /my_app /path/to/app.wsgi
    <Location /my_app>
        WSGIProcessGroup my_process
    </Location>

    WSGIDaemonProcess my_other_process
    WSGIScriptAlias /my_other_app /path/to/other_app.wsgi
    <Location /my_other_app>
        WSGIProcessGroup my_other_process
    </Location>

    WSGIApplicationGroup %{GLOBAL}
</VirtualHost>