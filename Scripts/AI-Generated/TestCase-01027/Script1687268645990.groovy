import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_i-am-looking-for-a-job'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/i-am-looking-for-a-job/89039')

'step 2: Add visual checkpoint at Page_t_i-am-looking-for-a-job'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01027_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
