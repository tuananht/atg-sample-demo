import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-configure-jar-name-of-custom-plugin-generated-by-katalonpluginpackage-task-of-the-katalon-gradle-6'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-configure-jar-name-of-custom-plugin-generated-by-katalonpluginpackage-task-of-the-katalon-gradle-plugin/27623/6')

'step 2: Add visual checkpoint at Page_t_how-to-configure-jar-name-of-custom-plugin-generated-by-katalonpluginpackage-task-of-the-katalon-gradle-6'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00723_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
