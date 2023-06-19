import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_test-suite-not-found-by-execute-katalon-studio-task-in-azuredevops'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/test-suite-not-found-by-execute-katalon-studio-task-in-azuredevops/52825')

'step 2: Add visual checkpoint at Page_t_test-suite-not-found-by-execute-katalon-studio-task-in-azuredevops'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00043_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
