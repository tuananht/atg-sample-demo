import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_what-is-the-best-way-to-execute-multi-line-2'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/what-is-the-best-way-to-execute-multi-line-query/13496/2')

'step 2: Add visual checkpoint at Page_t_what-is-the-best-way-to-execute-multi-line-2'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01365_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
