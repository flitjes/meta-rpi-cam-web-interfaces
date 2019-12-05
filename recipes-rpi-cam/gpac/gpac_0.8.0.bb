SUMMARY = "GPAC "
DESCRIPTION = "GPAC is a multimedia framework oriented towards rich media and distributed under the LGPL license (see COPYING)."
LICENSE = "LGPL"
SRC_URI = "git://github.com/gpac/gpac.git"
SRCREV = "v0.8.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=dcf3c825659e82539645da41a7908589"

S = "${WORKDIR}/git"
DEPENDS_append = " zlib strace libx11"

do_configure(){
#	sed -i 's,./configure, ./configure "$@",' run_configure.sh
	./configure --prefix=../sysroot-recipe/usr --libdir=lib/ --mandir=\$${prefix}/share/man --extra-cflags="-Wall -fPIC -DPIC" --enable-joystick --enable-debug --disable-ssl --verbose --X11-path=../sysroot-recipe/usr/X11R6/lib

}

do_compile(){
	make ${PARALLEL_MAKE}
}
do_install() {
	make install 'DESTDIR=${D}'
}
