import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-workaround-for-chromium-edge-driver-autoupdate-not-working'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-workaround-for-chromium-edge-driver-autoupdate-not-working/47333')

'step 2: Add visual checkpoint at Page_t_how-to-workaround-for-chromium-edge-driver-autoupdate-not-working'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00015_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
