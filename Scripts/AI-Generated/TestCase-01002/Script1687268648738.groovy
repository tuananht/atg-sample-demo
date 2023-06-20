import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_execute-xpath-functions-from-katalon-studio'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/execute-xpath-functions-from-katalon-studio/11937')

'step 2: Add visual checkpoint at Page_t_execute-xpath-functions-from-katalon-studio'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01002_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
