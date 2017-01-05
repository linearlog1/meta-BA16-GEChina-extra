# Copyright (C) 2016 Timesys Corporation
# Copyright (C) 2016 Advantech Corporation
# Released under the MIT license (see COPYING.MIT for the terms)

include recipes-kernel/linux/linux-imx.inc
include recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "imx_4.1.15_1.0.0_ga"
SRCREV = "d5d7c02d2fb59de6f61bb0962d08baecdf10c169"
LOCALVERSION = "-${SRCBRANCH}-dms-ba16"

SRC_URI = "git://git.freescale.com/imx/linux-2.6-imx.git;branch=${SRCBRANCH} \
           file://0001-rtc-rx8010-Add-driver-to-kernel.patch \
           file://0002-ahci_imx-Make-receive-DPLL-mode-configurable.patch \
           file://0003-PCI-imx6-Add-DT-bindings-to-configure-PHY-Tx-driver-.patch \
           file://0004-input-da9063_onkey-Add-driver.patch \
           file://0005-mfd-da9063-Add-support-for-OnKey-driver.patch \
           file://0006-add-usb-hub_test-suport.patch \
           file://0007-ARM-dts-imx-Add-support-for-Advantech-DMS-BA16.patch \
           file://defconfig"
SRC_URI +=" \
            file://0008-add-project-imx6dl-dms-ba16-kernel.patch \
           " 


COMPATIBLE_MACHINE = "(imx6dl-dms-ba16|imx6q-dms-ba16)"
  
