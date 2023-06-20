import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_not-able-to-run-my-python-script-in-katalon-studio-testcase'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/not-able-to-run-my-python-script-in-katalon-studio-testcase/84743')

'step 2: Add visual checkpoint at Page_t_not-able-to-run-my-python-script-in-katalon-studio-testcase'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00690_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
