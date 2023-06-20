import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-run-katalon-studio-test-case-test-suite-on-remote-virtual-machine'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-run-katalon-studio-test-case-test-suite-on-remote-virtual-machine/13917')

'step 2: Add visual checkpoint at Page_t_how-to-run-katalon-studio-test-case-test-suite-on-remote-virtual-machine'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00477_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
