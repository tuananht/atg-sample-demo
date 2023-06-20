import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_desired-capabilities-the-missing-manual'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/desired-capabilities-the-missing-manual/20748')

'step 2: Add visual checkpoint at Page_t_desired-capabilities-the-missing-manual'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00378_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
