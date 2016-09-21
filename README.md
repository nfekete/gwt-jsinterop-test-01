To start this sample, do the following:

*   `mvn clean war:exploded`
*   `mvn gwt:run`
*	Launch browser to open test page (use _Launch Default Browser_ button of DevMode app or open the address <http://localhost:8888/GwtJsInteropTest01.html>
*   The page is empty, but opening up browser dev console there should be an error (chrome: _Uncaught TypeError: Illegal invocation_ , firefox: _TypeError: 'get align' called on an object that does not implement interface HTMLDivElement._ )

Enjoy.
