import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_encoding-problem-of-variable-handed-to-a-get-2'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/encoding-problem-of-variable-handed-to-a-get-request/79856/2')

'step 2: Add visual checkpoint at Page_t_encoding-problem-of-variable-handed-to-a-get-2'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01136_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
