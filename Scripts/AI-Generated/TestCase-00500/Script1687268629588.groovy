import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-disable-save-your-info-dialog-in-edge-chromium'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-disable-save-your-info-dialog-in-edge-chromium/63116')

'step 2: Add visual checkpoint at Page_t_how-to-disable-save-your-info-dialog-in-edge-chromium'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00500_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
