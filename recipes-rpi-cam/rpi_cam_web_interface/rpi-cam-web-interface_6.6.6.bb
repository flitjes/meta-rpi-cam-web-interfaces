SUMMARY = "RPi Cam Web Interface "
DESCRIPTION = "Recipe to build and install RPi Cam Web Interface"
LICENSE = "MIT"
SRC_URI = "git://github.com/silvanmelchior/RPi_Cam_Web_Interface.git"
SRCREV = "master"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=cb638057a8ca56ea9bf7def3c950ccd0"

S = "${WORKDIR}/git"

RDEPENDS_${PN}_append = " apache2 php php-cli zip gstreamer1.0 "

python do_build() {
    bb.plain("***********************************************");
    bb.plain("*                                             *");
    bb.plain("*  Example recipe created by bitbake-layers   *");
    bb.plain("*                                             *");
    bb.plain("***********************************************");
}
