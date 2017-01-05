require recipes-bsp/u-boot/u-boot.inc

DESCRIPTION = "U-Boot for Advantech i.MX6 DMS-BA16 based platforms"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"
DEPENDS = "u-boot-mkimage-native"

PROVIDES = "u-boot"

SRCREV = "0e1e587ff4fc2d81ad4f6313f02c5ca4c8ceea01"
SRC_URI = "git://git.denx.de/u-boot.git \
           file://0001-arm-imx-Add-support-for-Advantech-DMS-BA16-board.patch \
"

SRC_URI +=" \
            file://0002-project-imx6dl-dms-ba16-bootloader.patch \
           " 
           
PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(imx6dl-dms-ba16|imx6q-dms-ba16)"
