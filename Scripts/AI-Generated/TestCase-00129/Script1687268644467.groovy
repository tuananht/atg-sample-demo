import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-allow-or-block-in-permission-24'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-allow-or-block-in-permission-popup/6819/24')

'step 2: Add visual checkpoint at Page_t_how-to-allow-or-block-in-permission-24'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00129_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
