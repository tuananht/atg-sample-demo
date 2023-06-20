import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_testing-react-elements-with-katalon-12'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/testing-react-elements-with-katalon-studio/11655/12')

'step 2: Add visual checkpoint at Page_t_testing-react-elements-with-katalon-12'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01291_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
